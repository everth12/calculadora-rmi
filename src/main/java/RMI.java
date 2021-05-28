/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author evert
 */
public class RMI extends UnicastRemoteObject implements calculadora{
    public RMI() throws RemoteException{int x,y;}
    
    public int multiplicar(int x , int y) throws RemoteException{
        
        return x*y;
    }
    public int sumar(int x, int y) throws RemoteException{
        
        return x+y;
    }
    public int restar(int x, int y) throws RemoteException{
        
        return x-y;
    }
    public int dividir(int x, int y) throws RemoteException{
        
        return x/y;
    }
}
    

