import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-proprietaires',
  templateUrl: './proprietaires.component.html',
  styleUrls: ['./proprietaires.component.css']
})
export class ProprietairesComponent implements OnInit{
  proprietaire : any;
  constructor(private http:HttpClient, private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8890/IMMATRICULATION-SERVICE/api/proprietaire/proprietaires").subscribe({
    next : (data)=>{
      this.proprietaire = data;
    },
    error : (err)=>{}
    })
  }

  updateProprietaire(id: number) {
      this.router.navigate(['proprietaires', id, 'update'])
  }

  goToAddProprietaire(): void {
    this.router.navigateByUrl('/saveproprietaire');
  }
}
