import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_BASE_URL } from './api.constants';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private USERS_URL = `${API_BASE_URL}/users`;

  constructor(private http: HttpClient) {}

  getUsers() {
    return this.http.get<any[]>(this.USERS_URL);
  }

  createUser(user: any) {
    return this.http.post(this.USERS_URL, user);
  }

  deleteUser(id: number) {
  return this.http.delete(
    `http://localhost:8080/api/admin/users/${id}`
  );
}


  getUserById(id: number) {
  return this.http.get<any>(
    `http://localhost:8080/api/admin/users/${id}`
  );
}

updateUser(id: number, user: any) {
  return this.http.put(
    `http://localhost:8080/api/admin/users/${id}`,
    user
  );
}


}
