import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [CommonModule, RouterModule],
  templateUrl: './user-list.html',
  styleUrls: ['./user-list.scss']
})
export class UserListComponent {

  users: any[] = [];

  constructor(private userService: UserService) {}

  fetchUsers() {
    this.userService.getUsers().subscribe({
      next: (data) => {
        // order by id DESC (latest first)
        this.users = data.sort((a: any, b: any) => b.id - a.id);
      },
      error: (err) => {
        console.error('Fetch error:', err);
        alert('Failed to fetch users');
      }
    });
  }

  deleteUser(id: number) {
    if (!confirm('Are you sure you want to delete this user?')) {
      return;
    }

    this.userService.deleteUser(id).subscribe({
      next: () => {
        alert('User deleted successfully');
        this.fetchUsers(); // auto refresh
      },
      error: (err) => {
        console.error('Delete error:', err);
        alert('Failed to delete user');
      }
    });
  }
}
