import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-proprietaireupd',
  templateUrl: './proprietaireupd.component.html',
  styleUrls: ['./proprietaireupd.component.css']
})
export class ProprietaireupdComponent {
  proprietaire: any = {};

  constructor(private http: HttpClient, private route: ActivatedRoute, private router: Router) {}

  ngOnInit() {
    const proprietaireId = this.route.snapshot.paramMap.get('id');
    this.getProprietaire(proprietaireId);
  }

  getProprietaire(id: string | null) {
    const url = `http://localhost:8890/IMMATRICULATION-SERVICE/api/proprietaire/proprietaires/${id}`;
    this.http.get(url).subscribe(
      (data) => {
        this.proprietaire = data;
      },
      (error) => {
        console.error('Error retrieving Proprietaire:', error);
      }
    );
  }

  updateProprietaire() {
    const url = `http://localhost:8890/IMMATRICULATION-SERVICE/api/proprietaire/updateproprietaires/${this.proprietaire.id}`;
    this.http.put(url, this.proprietaire).subscribe(
      (response) => {
        console.log('Proprietaire updated successfully:', response);
        this.router.navigate(['/proprietaires']);
      },
      (error) => {
        console.error('Error updating Proprietaire:', error);
      }
    );
  }
}
