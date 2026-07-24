// Insert a new track immediately after current playing track
public class Scenario1_Insertion {

    public void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);

        newNode.next = current.next; // save remaining queue
        current.next = newNode;      // connect current to new track
    }
}
