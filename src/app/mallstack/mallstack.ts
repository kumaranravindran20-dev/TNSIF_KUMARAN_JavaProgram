import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-mallstack',
  standalone: true,
  imports: [RouterLink, RouterOutlet],
  templateUrl: './mallstack.html',
  styleUrls: ['./mallstack.scss']
})
export class MallstackComponent {}
