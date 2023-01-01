package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_states0 implements _callable{

public static PrintWriter pw; 
public static _cls_states0 root;

public static LinkedHashMap<_cls_states0,_cls_states0> _cls_states0_instances = new LinkedHashMap<_cls_states0,_cls_states0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Owner\\Desktop\\University\\Year3_Sem1\\CPS3230 - Fundamentals of Software Testing\\assignment_part_2\\RT_Scraper/src/main/output_states.txt");

root = new _cls_states0();
_cls_states0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_states0 parent; //to remain null - this class does not have a parent!
int no_automata = 1;
 public boolean loggedIn =false ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_states0() {
}

public void initialisation() {
}

public static _cls_states0 _get_cls_states0_inst() { synchronized(_cls_states0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_states0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_states0_instances){
_performLogic_badLoginsProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_states0[] a = new _cls_states0[1];
synchronized(_cls_states0_instances){
a = _cls_states0_instances.keySet().toArray(a);}
for (_cls_states0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_states0_instances){
_cls_states0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_badLoginsProperty = 39;

public void _performLogic_badLoginsProperty(String _info, int... _event) {

_cls_states0.pw.println("[badLoginsProperty]AUTOMATON::> badLoginsProperty("+") STATE::>"+ _string_badLoginsProperty(_state_id_badLoginsProperty, 0));
_cls_states0.pw.flush();

if (0==1){}
else if (_state_id_badLoginsProperty==39){
		if (1==0){}
		else if ((_occurredEvent(_event,74/*LogIn*/))){
		loggedIn =true ;
_cls_states0.pw .println ("hoi");

		_state_id_badLoginsProperty = 35;//moving to state UserValidLogin
		_goto_badLoginsProperty(_info);
		}
}
else if (_state_id_badLoginsProperty==38){
		if (1==0){}
		else if ((_occurredEvent(_event,70/*CreateAlert*/))){
		
		_state_id_badLoginsProperty = 37;//moving to state AlertCreated
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,72/*ClearAlerts*/))){
		
		_state_id_badLoginsProperty = 38;//moving to state AlertsDeleted
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,78/*ViewedAlerts*/))){
		
		_state_id_badLoginsProperty = 36;//moving to state UserViewedAlerts
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,76/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_badLoginsProperty = 39;//moving to state UserLoggedOut
		_goto_badLoginsProperty(_info);
		}
}
else if (_state_id_badLoginsProperty==35){
		if (1==0){}
		else if ((_occurredEvent(_event,70/*CreateAlert*/))){
		
		_state_id_badLoginsProperty = 37;//moving to state AlertCreated
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,72/*ClearAlerts*/))){
		
		_state_id_badLoginsProperty = 38;//moving to state AlertsDeleted
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,78/*ViewedAlerts*/))){
		
		_state_id_badLoginsProperty = 36;//moving to state UserViewedAlerts
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,76/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_badLoginsProperty = 39;//moving to state UserLoggedOut
		_goto_badLoginsProperty(_info);
		}
}
else if (_state_id_badLoginsProperty==37){
		if (1==0){}
		else if ((_occurredEvent(_event,70/*CreateAlert*/))){
		
		_state_id_badLoginsProperty = 37;//moving to state AlertCreated
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,72/*ClearAlerts*/))){
		
		_state_id_badLoginsProperty = 38;//moving to state AlertsDeleted
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,78/*ViewedAlerts*/))){
		
		_state_id_badLoginsProperty = 36;//moving to state UserViewedAlerts
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,76/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_badLoginsProperty = 39;//moving to state UserLoggedOut
		_goto_badLoginsProperty(_info);
		}
}
else if (_state_id_badLoginsProperty==36){
		if (1==0){}
		else if ((_occurredEvent(_event,70/*CreateAlert*/))){
		
		_state_id_badLoginsProperty = 37;//moving to state AlertCreated
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,72/*ClearAlerts*/))){
		
		_state_id_badLoginsProperty = 38;//moving to state AlertsDeleted
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,78/*ViewedAlerts*/))){
		
		_state_id_badLoginsProperty = 36;//moving to state UserViewedAlerts
		_goto_badLoginsProperty(_info);
		}
		else if ((_occurredEvent(_event,76/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_badLoginsProperty = 39;//moving to state UserLoggedOut
		_goto_badLoginsProperty(_info);
		}
}
}

public void _goto_badLoginsProperty(String _info){
_cls_states0.pw.println("[badLoginsProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_badLoginsProperty(_state_id_badLoginsProperty, 1));
_cls_states0.pw.flush();
}

public String _string_badLoginsProperty(int _state_id, int _mode){
switch(_state_id){
case 39: if (_mode == 0) return "UserLoggedOut"; else return "UserLoggedOut";
case 38: if (_mode == 0) return "AlertsDeleted"; else return "AlertsDeleted";
case 35: if (_mode == 0) return "UserValidLogin"; else return "UserValidLogin";
case 37: if (_mode == 0) return "AlertCreated"; else return "AlertCreated";
case 36: if (_mode == 0) return "UserViewedAlerts"; else return "UserViewedAlerts";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}