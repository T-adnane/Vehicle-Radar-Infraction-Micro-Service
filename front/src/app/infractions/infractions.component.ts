import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent implements OnInit{
  infractions : any;
  constructor(private http:HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8890/INFRACTION-SERVICE/api/infraction/fullInfractions").subscribe({
      next : (data)=>{
        this.infractions = data;
      },
      error : (err)=>{}
    })
  }

  getVehicule(v: any) {
    this.router.navigateByUrl("/vehicule/"+v.vehicleMatricule);
  }

  getProprietaire(p: any) {
    this.router.navigateByUrl("/proprietaireInfo/"+p.vehicule.proprietaire.id);
  }
}
