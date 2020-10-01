package model;

/**
 * @author netvirus
 */

public class Mail implements  Mails {

    private static String _returnPath;
    private static String _deliveredTo;
    private static String _recived;
    private static String _senderFrom;
    private static String _reciverTo;
    private static String _subject;
    private static String _messageData;
    private static String _messageId;
    private static String _fileName;
    private static String _fileFullPath;

    public Mail(String returnPath, String deliveredTo, String recived, String senderFrom, String reciverTo, String subject,String messageData, String messageId, String fileName, String fileFullPath) {
        _returnPath = returnPath;
        _deliveredTo = deliveredTo;
        _recived = recived;
        _senderFrom = senderFrom;
        _reciverTo = reciverTo;
        _subject = subject;
        _messageData = messageData;
        _messageId = messageId;
        _fileName = fileName;
        _fileFullPath = fileFullPath;
    }

    public String getReturnPath() {
        return _returnPath;
    }

    public String getDeliveredTo() {
        return _deliveredTo;
    }

    public String getRecived() {
        return _recived;
    }

    public String getSenderFrom() {
        return _senderFrom;
    }

    public String getReciverTo() {
        return _reciverTo;
    }

    public String getSubject() {
        return _subject;
    }

    public String getMessageData() {
        return _messageData;
    }

    public String getMessageId() {
        return _messageId;
    }

    public String getFileName() {
        return _fileName;
    }

    public String getFileFullPath() {
        return _fileFullPath;
    }
}
