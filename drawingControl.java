package Question_number_2;

import java.util.LinkedList;

public class drawingControl {
    private LinkedList<Memento> commandHistory = new LinkedList<Memento>();
    private LinkedList<Memento> undoStack = new LinkedList<Memento>();
    private int maxCommands = 5;

    public void save(Shape s) {
        Memento m = new Memento(s);
        commandHistory.addFirst(m);
        if (commandHistory.size() > maxCommands) {
            commandHistory.removeLast();
        }
        System.out.println("last commands are: "+commandHistory);
    }

    public void undo() {
        if (commandHistory.isEmpty()) {
            return;
        }
        System.out.println("last commands are: "+commandHistory);
        int counter = 0;
        while(counter < 5) {
            if (commandHistory.isEmpty()) {
                break;
            }
            Memento m = commandHistory.removeFirst();
            undoStack.addFirst(m);
            counter++;
        }
        System.out.println("last commands after undo: "+commandHistory);
    }

    public void redo() {
        if (undoStack.isEmpty()) {
            return;
        }
        System.out.println("last commands are: "+commandHistory);
        int counter = 0;
        while(counter < 5) {
            if (undoStack.isEmpty()) {
                break;
            }
            Memento m = undoStack.removeFirst();
            commandHistory.addFirst(m);
            m.getState().draw();
            counter++;
        }
        System.out.println("last commands after redo: "+commandHistory);
    }
}
