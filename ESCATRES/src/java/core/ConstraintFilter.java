/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import esca_bussines.ConstraintValue;
import esca_bussines.DevelopmentBoard;
import esca_orm.DevelopmentBoardKit;
import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class ConstraintFilter {
    
    ArrayList<esca_bussines.ConstraintValue> constraintList = new ArrayList<>();
    ArrayList<esca_orm.DevelopmentBoardKit> devKitList = new ArrayList<>();
    
    public ConstraintFilter(ArrayList <esca_bussines.ConstraintValue> constraintList, ArrayList<esca_orm.DevelopmentBoardKit> devKitList) {
        this.constraintList = constraintList;
        this.devKitList= devKitList;
        
    }
    
    
    public void filter(){
        System.out.println("Size List Cnst = "+ devKitList.size());
        for (int i =0; i<devKitList.size(); i++) {
            
            for (ConstraintValue constraintValue : constraintList) {
                
                if(constraintValue.getType().equals("range")){
                    if(constraintValue.getName().equals("Cost")){
                        System.out.print("Cost"+ devKitList.get(i).getCost()+ ">"+constraintValue.getValue_b()+ " o "+"Cost"+ devKitList.get(i).getCost()+ "<"+constraintValue.getValue_a());
                        if(devKitList.get(i).getCost()>constraintValue.getValue_b() || devKitList.get(i).getCost()<constraintValue.getValue_a()  ){
                            System.out.println("-> REMOVIDO "+ devKitList.get(i).getName());
                            devKitList.remove(i);
                            i--;
                            break;
                        }
                    }else if (constraintValue.getName().equals("Weight")){
                        System.out.println("Weight");
                        System.out.print("Weight"+ devKitList.get(i).getWeight()+ ">"+constraintValue.getValue_b()+ " o "+"Weight"+ devKitList.get(i).getWeight()+ "<"+constraintValue.getValue_a());
                        if(devKitList.get(i).getWeight()>constraintValue.getValue_b() || devKitList.get(i).getWeight()<constraintValue.getValue_a()  ){
                            System.out.println("-> REMOVIDO "+ devKitList.get(i).getName());
                            devKitList.remove(i);
                            i--;
                        }
                    }
                }
                
            }
        }
        
    }

    public ArrayList<ConstraintValue> getConstraintList() {
        return constraintList;
    }

    public void setConstraintList(ArrayList<ConstraintValue> constraintList) {
        this.constraintList = constraintList;
    }

    public ArrayList<DevelopmentBoardKit> getDevKitList() {
        return devKitList;
    }

    public void setDevKitList(ArrayList<DevelopmentBoardKit> devKitList) {
        this.devKitList = devKitList;
    }
    
    
    
}
