/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import esca_orm.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.orm.PersistentException;
/**
 *
 * @author Marcelo Esperguel
 */
public class MinReqFilter {
    
    private MiniSpecification minSpec;
    private ArrayList<esca_orm.DevelopmentBoardKit>devKits;
    
            
    public MinReqFilter(MiniSpecification minSpec) throws PersistentException {
        
        this.minSpec = minSpec;
        
        esca_orm.DevelopmentBoardKit[] all= esca_orm.DAOFactory.getDAOFactory().getDevelopmentBoardKitDAO().listDevelopmentBoardKitByQuery(null, null);
        devKits = new ArrayList<>(Arrays.asList(all));
    }
       
    public void Filter(){
        //System.out.println("size= "+devKits.size());
        for (int i=0 ; i<devKits.size(); i++) {
            System.out.println("size= "+devKits.size());
            System.out.println("i= "+i);
            Double dataBusProc= Double.parseDouble(devKits.get(i).getProcessor().getDataBus());
            Double dataBusReq= Double.parseDouble(minSpec.getProcessorDataBus());
            
            System.out.print("BUS "+ dataBusProc+" < " +dataBusReq+"?");
            
            if(dataBusProc<dataBusReq){
                System.out.print(" REMOVIDO "+ devKits.get(i).getName());
                devKits.remove(i);
                
            }else{
            
            
                Double ramAmountProc= devKits.get(i).getRAM().getAmount();
                Double ramAmountReq= minSpec.getRamAmmount();
                System.out.print("RAM "+ramAmountProc+" < " +ramAmountReq+"?");
                if(ramAmountProc<ramAmountReq){
                    System.out.print(" REMOVIDO "+ devKits.get(i).getName());
                    devKits.remove(i);
                    
                }
            }
            
        }

        

    }

    public ArrayList<DevelopmentBoardKit> getDevKits() {
        return devKits;
    }
    
    
}
