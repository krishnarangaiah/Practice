
package concepts.events;

import java.util.EventListener;
import java.util.EventObject;

import javax.swing.event.EventListenerList;


public class EventTest {

	public static void main(String[] args) {

		EventManager eventManager = new EventManager();
		eventManager.addMyEventListener(new MustreamEventListner() {

			public void eventOccured(EventObject eventObject) {

				System.out.println("event fired");

			}
		});


		eventManager.fireEvent(new mustreamEventObject(new Object()));

	}
}

class mustreamEventObject extends EventObject {

	private static final long serialVersionUID = 1L;

	public mustreamEventObject(Object source) {
		super(source);
	}
}

interface MustreamEventListner extends EventListener {

	void eventOccured(EventObject eventObject);
}

class EventManager {

	private EventListenerList listenerList = new EventListenerList();

	public void addMyEventListener(EventListener listener) {
		listenerList.add(EventListener.class, listener);
	}

	public void removeMyEventListener(EventListener listener) {
		listenerList.remove(EventListener.class, listener);
	}

	public void fireEvent(EventObject eventObject) {
		System.out.println("Firing event to all Listners");

		for (Object object : listenerList.getListenerList()) {

			if (object instanceof MustreamEventListner) {
				((MustreamEventListner) object).eventOccured(eventObject);
			}

		}


	}
}