package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_postAlerts0 implements _callable{

public static PrintWriter pw; 
public static _cls_postAlerts0 root;

public static LinkedHashMap<_cls_postAlerts0,_cls_postAlerts0> _cls_postAlerts0_instances = new LinkedHashMap<_cls_postAlerts0,_cls_postAlerts0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Owner\\Desktop\\University\\Year3_Sem1\\CPS3230 - Fundamentals of Software Testing\\assignment_part_2\\RT_Scraper/src/main/output_postAlerts.txt");

root = new _cls_postAlerts0();
_cls_postAlerts0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_postAlerts0 parent; //to remain null - this class does not have a parent!
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_postAlerts0() {
}

public void initialisation() {
}

public static _cls_postAlerts0 _get_cls_postAlerts0_inst() { synchronized(_cls_postAlerts0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_postAlerts0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_postAlerts0_instances){
_performLogic_alertProperty(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_postAlerts0[] a = new _cls_postAlerts0[1];
synchronized(_cls_postAlerts0_instances){
a = _cls_postAlerts0_instances.keySet().toArray(a);}
for (_cls_postAlerts0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_postAlerts0_instances){
_cls_postAlerts0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_alertProperty = 7;

public void _performLogic_alertProperty(String _info, int... _event) {

_cls_postAlerts0.pw.println("[alertProperty]AUTOMATON::> alertProperty("+") STATE::>"+ _string_alertProperty(_state_id_alertProperty, 0));
_cls_postAlerts0.pw.flush();

if (0==1){}
else if (_state_id_alertProperty==7){
		if (1==0){}
		else if ((_occurredEvent(_event,10/*CreateAlert*/))){
		
		_state_id_alertProperty = 6;//moving to state AlertCreated
		_goto_alertProperty(_info);
		}
}
else if (_state_id_alertProperty==6){
		if (1==0){}
		else if ((_occurredEvent(_event,10/*CreateAlert*/))){
		
		_state_id_alertProperty = 6;//moving to state AlertCreated
		_goto_alertProperty(_info);
		}
		else if ((_occurredEvent(_event,12/*ClearAlerts*/))){
		
		_state_id_alertProperty = 7;//moving to state AlertsDeleted
		_goto_alertProperty(_info);
		}
}
}

public void _goto_alertProperty(String _info){
_cls_postAlerts0.pw.println("[alertProperty]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_alertProperty(_state_id_alertProperty, 1));
_cls_postAlerts0.pw.flush();
}

public String _string_alertProperty(int _state_id, int _mode){
switch(_state_id){
case 7: if (_mode == 0) return "AlertsDeleted"; else return "AlertsDeleted";
case 6: if (_mode == 0) return "AlertCreated"; else return "AlertCreated";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}