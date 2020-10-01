package model;

/**
 * @author netvirus
 */

public interface Mails {

    String getReturnPath();

    String getDeliveredTo();

    String getRecived();

    String getSenderFrom();

    String getReciverTo();

    String getSubject();

    String getMessageData();

    String getMessageId();

    String getFileName();

    String getFileFullPath();

}
