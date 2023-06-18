import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProprietairesComponent} from "./proprietaires/proprietaires.component";
import {VehiculesComponent} from "./vehicules/vehicules.component";
import {RadarsComponent} from "./radars/radars.component";
import {InfractionsComponent} from "./infractions/infractions.component";
import {VehiculeInfoComponent} from "./vehicule-info/vehicule-info.component";
import {ProprietaireInfoComponent} from "./proprietaire-info/proprietaire-info.component";

const routes: Routes = [
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
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
