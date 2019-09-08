import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewappliComponent } from './newappli/newappli.component';
import { ViewappliComponent } from './viewappli/viewappli.component';
import { DetailsComponent } from './details/details.component';


const routes: Routes = [
  {path: 'newappli', component: NewappliComponent},
  {path: 'api/customers', component: ViewappliComponent},
  {path: 'api/customers/:sid', component: DetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
