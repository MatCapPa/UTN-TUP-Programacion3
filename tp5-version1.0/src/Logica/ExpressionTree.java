package Logica;

import java.util.Stack;

public class ExpressionTree {



    public TreeNode constructTree(String infix) {
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Si es un número, manejar varios dígitos
            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    sb.append(infix.charAt(i++));
                }
                i--; // Decrementar para corregir el incremento del bucle for
                nodes.push(new TreeNode(sb.toString()));
            } else if (isOperator(ch)) {
                while (!ops.isEmpty() && precedence(ch) <= precedence(ops.peek())) {
                    nodes.push(applyOp(ops.pop(), nodes.pop(), nodes.pop()));
                }
                ops.push(ch);
            }
        }

        // Aplicar los operadores restantes
        while (!ops.isEmpty()) {
            nodes.push(applyOp(ops.pop(), nodes.pop(), nodes.pop()));
        }

        // El último nodo en la pila es la raíz del árbol
        return nodes.pop();
    }

    // Función para aplicar un operador a dos nodos
    private TreeNode applyOp(char op, TreeNode b, TreeNode a) {
        TreeNode node = new TreeNode(String.valueOf(op));
        node.left = a;
        node.right = b;
        return node;
    }

    // Función para obtener la precedencia de un operador
    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Función para verificar si un carácter es un operador
    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Función para realizar un recorrido in-order
    public void inorder(TreeNode t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.value + " ");
            inorder(t.right);
        }
    }

    // Función para evaluar el árbol binario de expresión
    public int evaluate(TreeNode root) {
        if (root.left == null && root.right == null)
            return Integer.parseInt(root.value);

        int leftEval = evaluate(root.left);
        int rightEval = evaluate(root.right);

        switch (root.value) {
            case "+":
                return leftEval + rightEval;
            case "-":
                return leftEval - rightEval;
            case "*":
                return leftEval * rightEval;
            case "/":
                return leftEval / rightEval;
        }

        return 0;
    }
}


