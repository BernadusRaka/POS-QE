
@searchaccount
Feature: Search account 
  

  Scenario: Admin dapat mencari account yang tersedia dengan keyword yang berkaitan
  Given Admin masuk ke halaman manage account
	When Admin menuliskan keyword terkait account yang tersedia di search bar
	Then Data account yang berhubungan dengan keyword muncul
  
  Scenario: Admin tidak dapat mencari account dengan keyword yang tidak invalid
  Given Admin masuk ke halaman manage account
	When Admin menuliskan keyword yang tidak terkait di search bar
	Then Tidak akan muncul data account
	  
 