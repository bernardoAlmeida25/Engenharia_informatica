/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Bernardo
 */
public class HeapNode<T> extends BinaryTreeNode<T>{
    protected HeapNode<T> parent;
    
    
    public HeapNode(T obj){
        super(obj);
        parent = null;
    }
}
