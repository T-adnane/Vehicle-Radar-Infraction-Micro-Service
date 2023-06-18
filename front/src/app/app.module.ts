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

@NgModule({
  declarations: [
    AppComponent,
    ProprietairesComponent,
    VehiculesComponent,
    RadarsComponent,
    InfractionsComponent,
    VehiculeInfoComponent,
    ProprietaireInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
