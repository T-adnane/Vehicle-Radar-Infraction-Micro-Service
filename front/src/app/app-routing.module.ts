import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProprietairesComponent} from "./proprietaires/proprietaires.component";
import {VehiculesComponent} from "./vehicules/vehicules.component";
import {RadarsComponent} from "./radars/radars.component";
import {InfractionsComponent} from "./infractions/infractions.component";
import {VehiculeInfoComponent} from "./vehicule-info/vehicule-info.component";
import {ProprietaireInfoComponent} from "./proprietaire-info/proprietaire-info.component";
import {HomeComponent} from "./home/home.component";
import {ProprietaireupdComponent} from "./proprietaireupd/proprietaireupd.component";
import {AddProprietaireComponent} from "./add-proprietaire/add-proprietaire.component";
import {AddVehiculeComponent} from "./add-vehicule/add-vehicule.component";
import {UpdateVehiculeComponent} from "./update-vehicule/update-vehicule.component";
import {AddRadarComponent} from "./add-radar/add-radar.component";
import {UpdateRadarComponent} from "./update-radar/update-radar.component";

const routes: Routes = [
  {
    path : "home", component : HomeComponent
  },
  {
    path : "proprietaires", component : ProprietairesComponent
  },
  {
    path : "vehicules", component : VehiculesComponent
  },
  {
    path : "radars", component : RadarsComponent
  },
  {
    path : "infractions", component : InfractionsComponent
  },
  {
    path : "vehicule/:vehiculeMatricule", component : VehiculeInfoComponent
  },
  {
    path : "proprietaireInfo/:id", component : ProprietaireInfoComponent
  },
  { path: 'proprietaires/:id/update', component: ProprietaireupdComponent },
  { path: 'saveproprietaire', component: AddProprietaireComponent },
  { path: 'savevehicule', component: AddVehiculeComponent },
  { path: 'updatevehicule/:id', component: UpdateVehiculeComponent },
  { path: 'saveveradar', component: AddRadarComponent },
  { path: 'updateradar/:id', component: UpdateRadarComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
