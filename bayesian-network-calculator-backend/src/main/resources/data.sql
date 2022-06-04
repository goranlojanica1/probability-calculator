INSERT INTO attack(name) VALUES ('Leveraging Race Conditions');
INSERT INTO attack(name) VALUES ('Manipulating State');
INSERT INTO attack(name) VALUES ('Interface Manipulation');
INSERT INTO attack(name) VALUES ('Authentication Abuse');
INSERT INTO attack(name) VALUES ('Excavation');
INSERT INTO attack(name) VALUES ('Privilege Abuse');
INSERT INTO attack(name) VALUES ('Shared Resource Manipulation');
INSERT INTO attack(name) VALUES ('Content Spoofing');
INSERT INTO attack(name) VALUES ('Resource Location Spoofing');
INSERT INTO attack(name) VALUES ('Infrastructure Manipulation');
INSERT INTO attack(name) VALUES ('Configuration/Environment Manipulation');
INSERT INTO attack(name) VALUES ('Reverse Engineering');
INSERT INTO attack(name) VALUES ('Protocol Analysis');
INSERT INTO attack(name) VALUES ('Functionality Misuse');
INSERT INTO attack(name) VALUES ('Privilege Escalation');
INSERT INTO attack(name) VALUES ('Modification During Manufacture');
INSERT INTO attack(name) VALUES ('Manipulation During Distribution');
INSERT INTO attack(name) VALUES ('Hardware Integrity Attack');
INSERT INTO attack(name) VALUES ('Malicious Logic Insertion');
INSERT INTO attack(name) VALUES ('Contaminate Resource');
INSERT INTO attack(name) VALUES ('Use of Known Domain Credentials');
INSERT INTO attack(name) VALUES ('Obstruction');
INSERT INTO attack(name) VALUES ('Hardware Fault Injection');

-- Attack: Leveraging Race Conditions
INSERT INTO weakness(name) VALUES('Missing Check for Certificate Revocation after Initial Check');
INSERT INTO weakness(name) VALUES('Concurrent Execution using Shared Resource with Improper Synchronization');
INSERT INTO weakness(name) VALUES('Hardware Logic Contains Race Conditions');
-- Attack: Manipulating State
INSERT INTO weakness(name) VALUES('Incomplete Internal State Distinction');
INSERT INTO weakness(name) VALUES('Improper Finite State Machines in Hardware Logic');
INSERT INTO weakness(name) VALUES('Uninitialized Value on Reset for Registers Holding Security Settings');
-- Attack: Interface Manipulation
INSERT INTO weakness(name) VALUES('System-on-Chip Using Components without Unique and Immutable Identifiers');
-- Attack: Authentication Abuse
INSERT INTO weakness(name) VALUES('Improper Authentication');
INSERT INTO weakness(name) VALUES('Internal Asset Exposed to Unsafe Debug Access Level or State');
-- Attack: Excavation
INSERT INTO weakness(name) VALUES('Exposure of Sensitive Information to an Unauthorized Actor');
INSERT INTO weakness(name) VALUES('Sensitive Non-Volatile Information Not Protected During Debug');
-- Attack: Privilege Abuse
INSERT INTO weakness(name) VALUES('Incorrect Permission Assignment for Critical Resource');
INSERT INTO weakness(name) VALUES('Missing Security Checks in Fabric Bridge');
-- Attack: Shared Resource Manipulation
INSERT INTO weakness(name) VALUES('Improper Isolation of Shared Resources on System-on-a-Chip');
INSERT INTO weakness(name) VALUES('Improper Isolation of Shared Resources in Network On Chip');
-- Attack: Content Spoofing
INSERT INTO weakness(name) VALUES('Insufficient Verification of Data Authenticity');
-- Attack: Configuration/Environment Manipulation
INSERT INTO weakness(name) VALUES('External Control of System or Configuration Setting');
INSERT INTO weakness(name) VALUES('Hardware Internal or Debug Modes Allow Override of Locks');
INSERT INTO weakness(name) VALUES('Security Version Number Mutable to Older Versions');
-- Attack: Protocol Analysis
INSERT INTO weakness(name) VALUES('Inadequate Encryption Strength');
-- Attack: Functionality Misuse
INSERT INTO weakness(name) VALUES('Inclusion of Undocumented Features or Chicken Bits');
INSERT INTO weakness(name) VALUES('Improper Write Handling in Limited-write Non-Volatile Memories');
INSERT INTO weakness(name) VALUES('Sequence of Processor Instructions Leads to Unexpected Behavior');
-- Attack: Privilege Escalation
INSERT INTO weakness(name) VALUES('Improper Privilege Management');
INSERT INTO weakness(name) VALUES('Hardware Logic with Insecure De-Synchronization between Control and Data Channels');
INSERT INTO weakness(name) VALUES('Improper Translation of Security Attributes by Fabric Bridge');
-- Attack: Manipulation During Distribution
INSERT INTO weakness(name) VALUES('Product Released in Non-Release Configuration');
-- Attack: Malicious Logic Insertion
INSERT INTO weakness(name) VALUES('Improper Access Control');
-- Attack: Use of Known Domain Credentials
INSERT INTO weakness(name) VALUES('Insufficiently Protected Credentials');
INSERT INTO weakness(name) VALUES('Use of Single-factor Authentication');
INSERT INTO weakness(name) VALUES('Password Aging with Long Expiration');
-- Attack: Hardware Fault Injection
INSERT INTO weakness(name) VALUES('Improper Protection Against Voltage and Clock Glitches');
INSERT INTO weakness(name) VALUES('Semiconductor Defects in Hardware Logic with Security-Sensitive Implications');
INSERT INTO weakness(name) VALUES('Improper Restriction of Software Interfaces to Hardware Features');

INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(1, 1);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(1, 2);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(1, 3);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(2, 4);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(2, 5);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(2, 6);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(3, 7);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(4, 8);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(4, 9);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(5, 10);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(5, 11);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(6, 12);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(6, 13);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(7, 14);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(7, 15);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(8, 16);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(11, 17);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(11, 18);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(11, 19);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(13, 20);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(14, 21);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(14, 22);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(14, 23);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(15, 24);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(15, 25);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(15, 26);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(17, 27);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(19, 28);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(21, 29);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(21, 30);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(21, 31);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(23, 32);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(23, 33);
INSERT INTO attack_weaknesses(attack_id, weakness_id) VALUES(23, 34);
