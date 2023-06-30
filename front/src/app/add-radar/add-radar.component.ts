import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-radar',
  templateUrl: './add-radar.component.html',
  styleUrls: ['./add-radar.component.css']
})
export class AddRadarComponent {
  radar: any = {};

  constructor(private http: HttpClient, private router: Router) {}

  onSubmit(): void {
    this.http.post('http://localhost:8890/RADAR-SERVICE/api/radar/addRadar', this.radar).subscribe({
      next: () => {
        console.log('Radar added successfully');
        this.router.navigateByUrl('/radars'); // Redirige vers la liste des radars
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }

}
