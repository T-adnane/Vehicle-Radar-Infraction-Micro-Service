import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-update-radar',
  templateUrl: './update-radar.component.html',
  styleUrls: ['./update-radar.component.css']
})
export class UpdateRadarComponent {

  radar: any = {}; // Object to store the updated radar data

  constructor(private http: HttpClient, private route: ActivatedRoute, private router: Router) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      // @ts-ignore
      const radarId = +params.get('id'); // Assuming the ID is passed as a route parameter
      this.getRadar(radarId);
    });
  }

  getRadar(id: number) {
    const url = `http://localhost:8890/RADAR-SERVICE/api/radar/radars/${id}`;
    this.http.get(url).subscribe({
      next: (data: any) => {
        this.radar = data;
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }

  onSubmit() {
    const url = `http://localhost:8890/RADAR-SERVICE/api/radar/updateRadar/${this.radar.id}`;
    this.http.put(url, this.radar).subscribe({
      next: () => {
        console.log('Radar updated successfully');
        // Perform any additional actions if needed
        this.router.navigate(['/radars']);
      },
      error: (err) => {
        console.error('Error:', err);
      }
    });
  }

}
