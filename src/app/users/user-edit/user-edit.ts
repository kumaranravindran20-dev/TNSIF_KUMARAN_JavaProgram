import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-user-edit',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './user-edit.html',
  styleUrls: ['./user-edit.scss']
})
export class UserEditComponent implements OnInit {

  id!: number;
  user = {
    name: '',
    email: ''
  };

  constructor(
    private route: ActivatedRoute,
    private userService: UserService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id'));

    this.userService.getUserById(this.id).subscribe({
      next: (data) => this.user = data,
      error: () => alert('Failed to load user')
    });
  }

  update() {
    this.userService.updateUser(this.id, this.user).subscribe({
      next: () => {
        alert('User updated successfully');
        this.router.navigate(['/users']);
      },
      error: () => alert('Update failed')
    });
  }
}
