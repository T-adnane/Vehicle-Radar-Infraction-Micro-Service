import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-vehicules',
  templateUrl: './vehicules.component.html',
  styleUrls: ['./vehicules.component.css']
})
export class VehiculesComponent implements OnInit {
  vehicules : any;
  constructor(private http:HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/vehicules").subscribe({
      next : (data)=>{
        this.vehicules = data;
      },
      error : (err)=>{}
    });
  }

  getProprietaire(c: any) {
    this.router.navigateByUrl("/proprietaireInfo/"+c.proprietaire.id);
  }

  goToAddVehicule(): void {
    this.router.navigateByUrl('/savevehicule');
  }
  redirectToUpdateVehicule(id: number) {
    this.router.navigateByUrl('/updatevehicule/' + id);
  }
  deleteVehicule(id: number): void {
    const url = `http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/deletevehicule/${id}`;
    this.http.delete(url).subscribe({
      next: () => {
        console.log('Vehicule deleted successfully');
        this.getVehicules(); // Refresh the list of vehicles
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }
  getVehicules(): void {
    this.http.get('http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/vehicules').subscribe({
      next: (data) => {
        this.vehicules = data;
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }
}
