package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_viewAlerts0 implements _callable{

public static PrintWriter pw; 
public static _cls_viewAlerts0 root;

public static LinkedHashMap<_cls_viewAlerts0,_cls_viewAlerts0> _cls_viewAlerts0_instances = new LinkedHashMap<_cls_viewAlerts0,_cls_viewAlerts0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Owner\\Desktop\\University\\Year3_Sem1\\CPS3230 - Fundamentals of Software Testing\\assignment_part_2\\RT_Scraper/src/main/output_viewAlerts.txt");

root = new _cls_viewAlerts0();
_cls_viewAlerts0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_viewAlerts0 parent; //to remain null - this class does not have a parent!
int no_automata = 1;
 public boolean loggedIn =false ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_viewAlerts0() {
}

public void initialisation() {
}

public static _cls_viewAlerts0 _get_cls_viewAlerts0_inst() { synchronized(_cls_viewAlerts0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_viewAlerts0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_viewAlerts0_instances){
_performLogic_viewsProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_viewAlerts0[] a = new _cls_viewAlerts0[1];
synchronized(_cls_viewAlerts0_instances){
a = _cls_viewAlerts0_instances.keySet().toArray(a);}
for (_cls_viewAlerts0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_viewAlerts0_instances){
_cls_viewAlerts0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_viewsProperty = 11;

public void _performLogic_viewsProperty(String _info, int... _event) {

_cls_viewAlerts0.pw.println("[viewsProperty]AUTOMATON::> viewsProperty("+") STATE::>"+ _string_viewsProperty(_state_id_viewsProperty, 0));
_cls_viewAlerts0.pw.flush();

if (0==1){}
else if (_state_id_viewsProperty==11){
		if (1==0){}
		else if ((_occurredEvent(_event,14/*LogIn*/))){
		loggedIn =true ;

		_state_id_viewsProperty = 9;//moving to state UserValidLogin
		_goto_viewsProperty(_info);
		}
		else if ((_occurredEvent(_event,18/*ViewedAlerts*/))){
		_cls_viewAlerts0.pw .println ("!! - Viewed Without Logging In");

		_state_id_viewsProperty = 8;//moving to state ViewAlertsWithoutLogging
		_goto_viewsProperty(_info);
		}
}
else if (_state_id_viewsProperty==9){
		if (1==0){}
		else if ((_occurredEvent(_event,18/*ViewedAlerts*/))){
		
		_state_id_viewsProperty = 10;//moving to state UserViewedAlerts
		_goto_viewsProperty(_info);
		}
		else if ((_occurredEvent(_event,16/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_viewsProperty = 11;//moving to state UserLoggedOut
		_goto_viewsProperty(_info);
		}
}
else if (_state_id_viewsProperty==10){
		if (1==0){}
		else if ((_occurredEvent(_event,18/*ViewedAlerts*/))){
		
		_state_id_viewsProperty = 10;//moving to state UserViewedAlerts
		_goto_viewsProperty(_info);
		}
		else if ((_occurredEvent(_event,16/*LoggedOut*/))){
		loggedIn =false ;

		_state_id_viewsProperty = 11;//moving to state UserLoggedOut
		_goto_viewsProperty(_info);
		}
}
}

public void _goto_viewsProperty(String _info){
_cls_viewAlerts0.pw.println("[viewsProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_viewsProperty(_state_id_viewsProperty, 1));
_cls_viewAlerts0.pw.flush();
}

public String _string_viewsProperty(int _state_id, int _mode){
switch(_state_id){
case 11: if (_mode == 0) return "UserLoggedOut"; else return "UserLoggedOut";
case 9: if (_mode == 0) return "UserValidLogin"; else return "UserValidLogin";
case 8: if (_mode == 0) return "ViewAlertsWithoutLogging"; else return "!!!SYSTEM REACHED BAD STATE!!! ViewAlertsWithoutLogging "+new _BadStateExceptionviewAlerts().toString()+" ";
case 10: if (_mode == 0) return "UserViewedAlerts"; else return "UserViewedAlerts";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}