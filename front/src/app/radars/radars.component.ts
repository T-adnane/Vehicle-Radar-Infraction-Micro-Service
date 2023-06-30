import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent implements OnInit{
  radars : any;
  constructor(private http:HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8890/RADAR-SERVICE/api/radar/radars").subscribe({
      next : (data)=>{
        this.radars = data;
      },
      error : (err)=>{}
    })
  }

  deleteRadar(id: number): void {
    const apiUrl = `http://localhost:8890/RADAR-SERVICE/api/radar/deleteRadar/${id}`;

    this.http.delete(apiUrl).subscribe(
      () => {
        // Succès : traitement
        console.log('Radar deleted successfully.');
        this.refreshRadars(); // Appeler la méthode pour rafraîchir la liste des radars
      },
      (error) => {
        // Erreur : traitement
        console.error('Error deleting radar:', error);
      }
    );
  }

  goToAddRadar(): void {
    this.router.navigateByUrl('/saveveradar');
  }

  refreshRadars(): void {
    const apiUrl = 'http://localhost:8890/RADAR-SERVICE/api/radar/radars';

    this.http.get(apiUrl).subscribe(
      (data) => {
        this.radars = data;
        console.log('Radars refreshed successfully.');
      },
      (error) => {
        console.error('Error refreshing radars:', error);
      }
    );
  }

  redirectToUpdateRadar(id: number) {
    this.router.navigateByUrl('/updateradar/' + id);
  }

}
