import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-proprietaire',
  templateUrl: './add-proprietaire.component.html',
  styleUrls: ['./add-proprietaire.component.css']
})
export class AddProprietaireComponent {
  proprietaire: any = {}; // Object to store the property owner information

  constructor(private http: HttpClient, private router: Router) {}

  onSubmit() {
    this.http.post('http://localhost:8890/IMMATRICULATION-SERVICE/api/proprietaire/saveproprietaire', this.proprietaire)
      .subscribe(
        () => {
          console.log('Proprietaire added successfully');
          this.router.navigate(['/proprietaires']);
        },
        error => {
          console.error('Error occurred while adding proprietaire:', error);
        }
      );
  }
}
