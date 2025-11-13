public class Main {

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
}

class ArbolBinario<E> {
    private Node<E> root;

    public ArbolBinario(Node<E> root) {
        this.root = root;
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

    public void preOrdenRecursivo{

    }
}

