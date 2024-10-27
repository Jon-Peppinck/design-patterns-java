package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject (YouTube Channel)
public class YouTubeChannel {
  private final List<Observer_subscriber> subscribers = new ArrayList<>();
  private String latestVideo;

  public void subscribe(Observer_subscriber subscriber) {
    subscribers.add(subscriber);
  }

  public void unsubscribe(Observer_subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  public void uploadVideo(String videoTitle) {
    this.latestVideo = videoTitle;
    notifySubscribers();
  }

  private void notifySubscribers() {
    for (Observer_subscriber subscriber : subscribers) {
      subscriber.update(latestVideo);
    }
  }
}
