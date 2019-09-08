import { Component, OnInit } from '@angular/core';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  welcomeMessageFromService : String
  constructor(private service:WelcomeDataService) { }
  getWelcomeMessage() {
    // console.log(this.service.executeHelloWorldBeanService());
    this.service.executeHelloWorldBeanService().subscribe(
      response => this.handleSuccessfulResponse(response),
      error => this.handleErrorResponse(error)
    );
    // console.log('last line of get well');
    // console.log("Welcome message");
  }

  handleSuccessfulResponse(response) {
    // console.log(response);
    this.welcomeMessageFromService  = response.message
    console.log(response.message);
  }
 
  handleErrorResponse(error) {
    console.log(error)
  }

  ngOnInit() {
  }

}
