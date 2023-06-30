import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-vehicule',
  templateUrl: './add-vehicule.component.html',
  styleUrls: ['./add-vehicule.component.css']
})
export class AddVehiculeComponent {
  vehicule: any = {};

  constructor(private http: HttpClient, private router: Router) {}

  onSubmit(): void {
    this.http.post('http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/savevehicule', this.vehicule).subscribe({
      next: () => {
        console.log('Vehicule added successfully');
        this.router.navigateByUrl('/vehicules'); // Redirect to the vehicle list
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }
}
