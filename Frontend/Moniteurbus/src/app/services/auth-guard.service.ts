import { Injectable } from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree} from "@angular/router";
import {map, Observable, take} from 'rxjs';
import {AuthService} from "./auth.service";

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor(private authService:AuthService,private router:Router) {
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    return  this.authService.user.pipe(take(1),
      map(user=>{
      const isAuth =!!user;
      if(isAuth){
         //if(user?.roles.includes(route.data['role'])) return true;
        const intersectedRoles = route.data['role'].includes(user.roles);
        console.log(intersectedRoles);
        
        //user.roles.filter(value => );
        const isAuthorized= intersectedRoles;
        console.log(isAuthorized);
        if(isAuthorized)return true;

      }
      return this.router.createUrlTree(["/login"]);
    }))
    }



}
