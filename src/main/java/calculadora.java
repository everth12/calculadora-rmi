/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author evert
 */
public interface calculadora extends Remote{
    public int multiplicar(int x, int y ) throws RemoteException;
    public int sumar(int x, int y ) throws RemoteException;
    public int restar(int x, int y ) throws RemoteException;
    public int dividir(int x, int y ) throws RemoteException;
    
    
}
