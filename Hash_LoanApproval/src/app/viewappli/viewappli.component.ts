import { Component, OnInit } from '@angular/core';
import { WelcomeDataService } from '../service/data/welcome-data.service';
import { Person } from '../Person';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-viewappli',
  templateUrl: './viewappli.component.html',
  styleUrls: ['./viewappli.component.css']
})
export class ViewappliComponent implements OnInit {
  

  ssn:number;
  persons: Observable<Person[]>;
  constructor(private  welcomeDataService: WelcomeDataService) { }

  ngOnInit() {
    this.persons = this.welcomeDataService.getCustomersList();
  }
  showMyContainer: boolean = false;
   customer : Person;
   showDetail:boolean = false;

   selected:boolean = false;
   rejected:boolean = false;
  getCustomer(ssn:number){
    console.log(ssn);
    this.welcomeDataService.getCustomerBySSN(ssn).subscribe(
      data=>{console.log("success @ ssn");this.customer = data; this.showDetail = true;
    if(data.score > 0.6)
      this.selected = true;
    else
    this.rejected = true;
    },
      error=>console.log("Error @ ssn")
    )
      
    
  }
}
