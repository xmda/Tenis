

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHURITA
 */
public class Puntaje {
    String j1="Jugador 1";
    String j2="Jugador 2";
    
    public String scoreIng(int [] puntos, String [] idioma){
        String [] g;
        g = idioma;
        if(puntos[0]==0 && puntos[1]==0){
        return idioma[0]+("-")+idioma[9];
      	} else {
      	 	if(puntos[0]==0 && puntos[1]==15){
                    return idioma[0]+("-")+idioma[1];} 
                else {
       	  	if(puntos[0]==0 && puntos[1]==30){
                    return idioma[0]+("-")+idioma[2];} 
                else {
                if(puntos[0]==0 && puntos[1]==40){
                    return idioma[0]+("-")+idioma[3];}
                else {
                if(puntos[0]==15 && puntos[1]==0){
                    return idioma[1]+("-")+idioma[0];} 
                else {
                if(puntos[0]==30 && puntos[1]==0){
                    return idioma[2]+("-")+idioma[0];}
                else {
                if(puntos[0]==40 && puntos[1]==0){
                    return idioma[3]+("-")+idioma[0];}
                else {
                if(puntos[0]==15 && puntos[1]==15){
      	            return idioma[1]+("-")+idioma[9];}
                else {
	        if(puntos[0]==15 && puntos[1]==30){
	            return idioma[1]+("-")+idioma[2];}
                else {
                if(puntos[0]==15 && puntos[1]==40){
	            return idioma[1]+("-")+idioma[3];}
                else {                        
                if(puntos[0]==30 && puntos[1]==15){
                    return idioma[2]+("-")+idioma[1];}
                else {
	        if(puntos[0]==40 && puntos[1]==15){
                    return idioma[3]+("-")+idioma[1];}
                else {
		if((puntos[0]==30 && puntos[1]==30)){
                    return idioma[2]+("-")+idioma[9];}
                else {
   		if(puntos[0]==30 && puntos[1]==40){
                    return idioma[2]+("-")+idioma[3];}
                else {
                if(puntos[0]==40 && puntos[1]==30){
                    return idioma[3]+("-")+idioma[2];}
                else {
                if((puntos[0]==50 && puntos[1]==0) || (puntos[0]==50 && puntos[1]==15) || (puntos[0]==50 && puntos[1]==30) || (puntos[0]==60 && puntos[1]==40) || (puntos[0]==70 && puntos[1]==50) || (puntos[0]==80 && puntos[1]==60)){
                    return idioma[4];}
                else{
                if((puntos[0]==0 && puntos[1]==50) || (puntos[0]==15 && puntos[1]==50) || (puntos[0]==30 && puntos[1]==50) || (puntos[0]==40 && puntos[1]==60) || (puntos[0]==50 && puntos[1]==70) || (puntos[0]==60 && puntos[1]==80)){
                    return idioma[5];}
                else {
                if((puntos[0]==40 && puntos[1]==40) || (puntos[0]==50 && puntos[1]==50) || (puntos[0]==60 && puntos[1]==60) || (puntos[0]==70 && puntos[1]==70) || (puntos[0]==80 && puntos[1]==80)){
                    return idioma[6];}
                else {
                if((puntos[0]==50 && puntos[1]==40) || (puntos[0]==60 && puntos[1]==50) || (puntos[0]==70 && puntos[1]==60)){ 
                    return idioma[7];}
                else {
                if( (puntos[0]==40 && puntos[1]==50) || (puntos[0]==50 && puntos[1]==60) || (puntos[0]==60 && puntos[1]==70)){
                    return idioma[8];}
                    }}}}}}}}}}}}}}}}}}}
        return "¿Quieres volver a jugar?";
    }
        

   
}
