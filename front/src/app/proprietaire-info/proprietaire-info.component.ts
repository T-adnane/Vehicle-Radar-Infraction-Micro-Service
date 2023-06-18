import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-proprietaire-info',
  templateUrl: './proprietaire-info.component.html',
  styleUrls: ['./proprietaire-info.component.css']
})
export class ProprietaireInfoComponent implements OnInit{
  proprietaire:any;
  id!:Number;
  constructor(private http: HttpClient, private router: Router, private route:ActivatedRoute) {
    this.id = route.snapshot.params['id'];
  }
  ngOnInit(): void {
    this.http.get('http://localhost:8890/IMMATRICULATION-SERVICE/api/proprietaire/proprietaires/'+this.id).subscribe({
      next: (data) => {
        this.proprietaire = data;
      },
      error: (err) => {},
    });
  }
}
