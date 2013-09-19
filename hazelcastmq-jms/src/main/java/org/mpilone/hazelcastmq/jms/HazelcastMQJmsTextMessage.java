package org.mpilone.hazelcastmq.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * A JMS text message to be sent over the HazelcastMQ.
 * 
 * @author mpilone
 */
class HazelcastMQJmsTextMessage extends HazelcastMQJmsMessage implements
    TextMessage {

  /**
   * The body of the message.
   */
  private String body;

  public HazelcastMQJmsTextMessage() throws JMSException {
    super();

    setJMSType("TextMessage");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.mpilone.hazelcastmq.HazelcastMQMessage#clearBody()
   */
  @Override
  public void clearBody() throws JMSException {
    body = null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.jms.TextMessage#getText()
   */
  @Override
  public String getText() throws JMSException {
    return body;
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.jms.TextMessage#setText(java.lang.String)
   */
  @Override
  public void setText(String text) throws JMSException {
    body = text;
  }

}
