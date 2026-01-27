import { Routes } from '@angular/router';
import { MallstackComponent } from './mallstack/mallstack';
import { UserListComponent } from './users/user-list/user-list';
import { UserCreateComponent } from './users/user-create/user-create';
import { UserEditComponent } from './users/user-edit/user-edit';

export const routes: Routes = [
  {
    path: '',
    component: MallstackComponent,
    children: [
      { path: 'users', component: UserListComponent },
      { path: 'users/create', component: UserCreateComponent },
      { path: 'users/edit/:id', component: UserEditComponent }
    ]
  }
];
