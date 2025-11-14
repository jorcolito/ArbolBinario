import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main() {
        ArbolBinario arbol = new ArbolBinario<>();

        arbol.setRoot(new Node<>("A"));
        arbol.getRoot().setLeft(new Node<>("B"));
        arbol.getRoot().setRight(new Node<>("C"));
        arbol.getRoot().getLeft().setLeft(new Node<>("D"));
        arbol.getRoot().getLeft().setRight(new Node<>("E"));
        arbol.getRoot().getRight().setLeft(new Node<>("F"));
        arbol.getRoot().getRight().setRight(new Node<>("G"));
        arbol.getRoot().getLeft().getLeft().setRight(new Node<>("H"));


        System.out.println(arbol.altura());
        System.out.println("");
        System.out.println("Arbol en PreOrden: ");
        arbol.preOrden();
        System.out.println("Arbol en EnOrden: ");
        arbol.enOrden();
        System.out.println("Arbol en PostOrden: ");
        arbol.postOrden();
    }
}

class Node<E> {
    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E data) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public boolean isLeaf(Node<E> node){
        if(node.getLeft() == null && node.getRight()==null) {return true;}
        else return false;
    }
}

class ArbolBinario<E> {
    private Node<E> root;
    private Queue<E> preOrden = new LinkedList<>();
    private Queue<E> enOrden = new LinkedList<>();
    private Queue<E> postOrden = new LinkedList<>();


    public ArbolBinario() {
        this.root = null;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public int altura(){
        return buscarAlturaRecursiva(this.root);
    }

    public int buscarAlturaRecursiva(Node<E> nodoActual){
        if (nodoActual==null){
            return 0;
        }

        int izquierda = buscarAlturaRecursiva(nodoActual.getLeft());
        int derecha = buscarAlturaRecursiva(nodoActual.getRight());

        return Math.max(izquierda, derecha)+1;
    }

    public void preOrden(){
        preOrdenRecursivo(this.root);
        System.out.println(preOrden);
    }

    public void preOrdenRecursivo(Node<E> nodoActual){
        if (nodoActual==null){return;}
        preOrden.add(nodoActual.getData());
        preOrdenRecursivo(nodoActual.getLeft());
        preOrdenRecursivo(nodoActual.getRight());
    }

    public void enOrden(){
        enOrdenRecursivo(this.root);
        System.out.println(enOrden);
    }

    public void enOrdenRecursivo(Node<E> nodoActual){
        if (nodoActual==null){return;}
        enOrdenRecursivo(nodoActual.getLeft());
        enOrden.add(nodoActual.getData());
        enOrdenRecursivo(nodoActual.getRight());
    }

    public void postOrden(){
        postOrdenRecursivo(this.root);
        System.out.println(postOrden);
    }

    public void postOrdenRecursivo(Node<E> nodoActual){
        if (nodoActual==null){return;}
        postOrdenRecursivo(nodoActual.getLeft());
        postOrdenRecursivo(nodoActual.getRight());
        postOrden.add(nodoActual.getData());
    }

    public void estaLleno(){
        estaLlenoRecursivo(this.root);
    }

    public boolean estaLlenoRecursivo(Node<E> nodoActual) {
        if(nodoActual==null){return true;}
    }
}

