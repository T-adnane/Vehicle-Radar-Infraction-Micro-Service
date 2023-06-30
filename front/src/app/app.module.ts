import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProprietairesComponent } from './proprietaires/proprietaires.component';
import {HttpClientModule} from "@angular/common/http";
import { VehiculesComponent } from './vehicules/vehicules.component';
import { RadarsComponent } from './radars/radars.component';
import { InfractionsComponent } from './infractions/infractions.component';
import { VehiculeInfoComponent } from './vehicule-info/vehicule-info.component';
import { ProprietaireInfoComponent } from './proprietaire-info/proprietaire-info.component';
import { HomeComponent } from './home/home.component';
import { ProprietaireupdComponent } from './proprietaireupd/proprietaireupd.component';
import {FormsModule} from "@angular/forms";
import { AddProprietaireComponent } from './add-proprietaire/add-proprietaire.component';
import { AddVehiculeComponent } from './add-vehicule/add-vehicule.component';
import { UpdateVehiculeComponent } from './update-vehicule/update-vehicule.component';
import { AddRadarComponent } from './add-radar/add-radar.component';
import { UpdateRadarComponent } from './update-radar/update-radar.component';

@NgModule({
  declarations: [
    HomeComponent,
    AppComponent,
    ProprietairesComponent,
    VehiculesComponent,
    RadarsComponent,
    InfractionsComponent,
    VehiculeInfoComponent,
    ProprietaireInfoComponent,
    ProprietaireupdComponent,
    AddProprietaireComponent,
    AddVehiculeComponent,
    UpdateVehiculeComponent,
    AddRadarComponent,
    UpdateRadarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
