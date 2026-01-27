import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-create',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './user-create.html',
  styleUrls: ['./user-create.scss']
})
export class UserCreateComponent {

  user = {
    name: '',
    email: '',
    password: ''   // ✅ ADD THIS
  };

  constructor(
    private userService: UserService,
    private router: Router
  ) {}

  submit() {
  if (!this.user.name || !this.user.email || !this.user.password) {
    alert('All fields are required');
    return;
  }

  this.userService.createUser(this.user).subscribe({
    next: (res) => {
      console.log('User created:', res);
      alert('User created successfully');

      // reset form
      this.user = { name: '', email: '', password: '' };

      // navigate to list
      this.router.navigate(['/users']);
    },
    error: (err) => {
      console.error('Create user error:', err);

      // show backend message if available
      if (err?.error?.message) {
        alert(err.error.message);
      } else {
        alert('Failed to create user');
      }
    }
  });
}

}
