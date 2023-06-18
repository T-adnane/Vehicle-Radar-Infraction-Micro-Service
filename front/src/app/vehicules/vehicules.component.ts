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
}
