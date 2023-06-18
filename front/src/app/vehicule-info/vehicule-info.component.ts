import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-vehicule-info',
  templateUrl: './vehicule-info.component.html',
  styleUrls: ['./vehicule-info.component.css']
})
export class VehiculeInfoComponent implements OnInit{
  vehicule:any;
  vehiculeMatricule!:String;
  constructor(private http: HttpClient, private router: Router, private route:ActivatedRoute) {
    this.vehiculeMatricule = route.snapshot.params['vehiculeMatricule'];
  }
  ngOnInit(): void {
    this.http.get('http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/vehiculeByNumMatricule/'+this.vehiculeMatricule).subscribe({
      next: (data) => {
        this.vehicule = data;
      },
      error: (err) => {},
    });
  }

  getProprietaire(c: any) {
    this.router.navigateByUrl("/proprietaireInfo/"+c.proprietaire.id);
  }

}
