/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biprajitdebnath
 */

import com.email.durgesh.Email;

class EmailSender 
{
    public static void main(String[] args)
    {
        try
        {
            Email email = new Email("biprajit1999@gmail.com","amita1976");
            email.setFrom("biprajit1999@gmail.com", "Hello India");
            email.setSubject("Kuch nahi tiem pass");
            email.setText("Hello, I love you very much..!!!🧚🏻🧚🏼‍♂️🧚🏼‍♂️🧚🏼‍♂️❤️🧡💛💙🤎💜🤍❤️‍🔥❤️‍🔥💔❤️‍🩹❣️💞💓💖💖💗💘💟💘❤️‍🔥❤️‍🔥");
            email.setContent("Hello, I love you!!!", "html/string");
            email.addRecipient("debnathbiprajit@gmail.com");
            
            email.send();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
