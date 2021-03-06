package com.tecsolvent.wizspeak.notification.services;

import java.util.List;
import java.util.Map;

import com.tecsolvent.wizspeak.notification.dao.Notification;

/* Service class to handle CRUD operations for notifications.*/
public interface NotificationService {
	
	/**
	 * Creates or updates a notification.
	 * @param userId, user identifier 
	 * @param postId, post identifier
	 * @param notificationType, type of notification to be generated.
	 * @param msgContainer, data map to construct the message.
	 * @throws NotificationLogicException
	 */
	public void create(long userId, long postId, Notification.Type notificationType, Map<String, String> msgContainer) throws NotificationLogicException;
	
	/**
	 * Updates a notification. 
	 * Note :- Null values should be ignored.
	 * @param notification, notification object
	 * @throws NotificationLogicException
	 */
	public void update(Notification notification) throws NotificationLogicException;	
	
	
	/**
	 * Retrieves notifications of given user.
	 * @param userId, user identifier
	 * @param offset, index of the notification.
	 * @param limit, number of notification required.
	 * @return list of notification based on limit and offset.
	 * @throws NotificationLogicException
	 */
	public List<Notification> get(long userId, long offset, long limit) throws NotificationLogicException;
	
	/**
	 * Retrieves all notifications of the user.
	 * @param userId, user identifier.
	 * @return list of all notification for the given user.
	 * @throws NotificationLogicException
	 */
	public List<Notification> get(long userId) throws NotificationLogicException;

}
