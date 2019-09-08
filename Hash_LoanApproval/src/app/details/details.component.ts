import { Component, OnInit, Input } from '@angular/core';
import { Person } from '../Person';
import { ViewappliComponent } from '../viewappli/viewappli.component';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  @Input() 
  public person: Person;
  constructor( private welcomeDataService:WelcomeDataService) { 
    console.warn(this.person);
  }
  
  ngOnInit() {
  }

}
