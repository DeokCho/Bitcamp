package com.jse.member;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jse.grade.Grade;
import com.jse.grade.GradeService;
import com.jse.grade.GradeServiceImpl;

public class MemberView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel, 
         				ssnLabel,addrLabel;  

    private JTextField nameText, useridText, passwordText, ssnText, 
         					addrText; 

    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton; 
    public MemberService memberService;
    public void open(){ 
        memberService = new MemberServiceImpl();
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 25); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 25); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 25); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        useridText.setSize(150, 25); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 25); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JTextField(); 
        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        passwordText.setSize(150, 25); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 25); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        ssnText.setSize(150, 25); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 25); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        addrText.setSize(150, 25); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
        
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 25); 
        submitButton.setLocation(100, 450); 
        submitButton.addActionListener(this);
        container.add(submitButton); 
  
        
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 25); 
        listButton.setLocation(220, 450); 
        listButton.addActionListener(this);
        container.add(listButton); 
        
        loginButton = new JButton("Login"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 25); 
        loginButton.setLocation(340, 450); 
        loginButton.addActionListener(this);
        container.add(loginButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 

    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== submitButton) {
			nameText.setText("1번맨,2번맨,3번맨,4번맨,5번맨");
			useridText.setText("1,2,3,4,5");
			passwordText.setText("1,2,3,4,5");
			ssnText.setText("910101-1,920202-2,930303-3,940404-4,950505-5");
			addrText.setText("서울,대전,대구,부산,인천");
			
			String[] names = nameText.getText().split(",");
			String[] userids= useridText.getText().split(",");
			String[] passwords = passwordText.getText().split(",");
			String[] ssns = ssnText.getText().split(",");
			String[] addrs = addrText.getText().split(",");
			
			Member[] members = new Member[5];
			for(int i=0; i<members.length; i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwords[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
			}
		}else if(e.getSource()==listButton) {
			Member[] members = memberService.getMemebers();
			String result = "";
			for(int i=0; i<members.length; i++) {
				result +=(members[i]+"\n");
			}
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(result);
		}else if(e.getSource()==loginButton) {
			JOptionPane.showMessageDialog(this, "login"+useridText.getText()+","+passwordText.getText());
			Member member = new Member();
			member.setUserid(useridText.getText());
			member.setPasswd(passwordText.getText());
			Member login = memberService.login(member);
			if(login != null ) {
				resultText.setText(login.toString());
			}else {
				resultText.setText("로그인 실패");
			}
		}
	}

}