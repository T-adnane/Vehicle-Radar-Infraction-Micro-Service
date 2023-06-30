import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-update-vehicule',
  templateUrl: './update-vehicule.component.html',
  styleUrls: ['./update-vehicule.component.css']
})
export class UpdateVehiculeComponent {
  vehicule: any = {}; // Object to store the updated vehicle data

  constructor(private http: HttpClient, private route: ActivatedRoute, private router: Router) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      // @ts-ignore
      const vehiculeId = +params.get('id'); // Assuming the ID is passed as a route parameter
      this.getVehicule(vehiculeId);
    });
  }

  getVehicule(id: number) {
    const url = `http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/vehicules/${id}`;
    this.http.get(url).subscribe({
      next: (data: any) => {
        this.vehicule = data;
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }

  onSubmit() {
    const url = `http://localhost:8890/IMMATRICULATION-SERVICE/api/vehicule/updatevehicule/${this.vehicule.id}`;
    this.http.put(url, this.vehicule).subscribe({
      next: () => {
        console.log('Vehicule updated successfully');
        // Perform any additional actions if needed
        this.router.navigate(['/vehicules']);
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }
}
