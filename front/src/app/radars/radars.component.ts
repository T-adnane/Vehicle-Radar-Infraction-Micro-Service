import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent implements OnInit{
  radars : any;
  constructor(private http:HttpClient) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8890/RADAR-SERVICE/api/radar/radars").subscribe({
      next : (data)=>{
        this.radars = data;
      },
      error : (err)=>{}
    })
  }
}
