 
import React, { useRef, useState } from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  TextInput,
  Button,
} from 'react-native';

import { 
  Colors, 
} from 'react-native/Libraries/NewAppScreen';

const App  = () => {

  const [cgpa , setcgpa] = useState();
  const [da , setDa] = useState();
  const [ux , setUx] = useState();
  const [mobile , setmobile] = useState();
  const [fstack , setfstack] = useState();

  const calculate = () =>  {
    console.log(parseInt(da) + parseInt(ux) +  parseInt(mobile) +  parseInt(fstack));
    setcgpa((parseInt(da) + parseInt(ux) +  parseInt(mobile) +  parseInt(fstack))/ 4);
  }

  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <ScrollView
          contentInsetAdjustmentBehavior="automatic"
          style={styles.scrollView}>
          <View style={styles.body}>
            <Text style={styles.title}>CGPA Grade Calculator</Text>
            <Text style={styles.title}>Avrage : {cgpa}</Text>
            <TextInput style={styles.input} placeholder="Data Analytics Marks" onChangeText={(e)=> { setDa(e)}} />
            <TextInput style={styles.input} placeholder="Data UI/UX Marks" onChangeText={(e)=> { setUx(e)}} />
            <TextInput style={styles.input} placeholder="Data Mobile Marks" onChangeText={(e)=> { setmobile(e)}} />
            <TextInput style={styles.input} placeholder="Set Full Stack" onChangeText={(e)=> { setfstack(e)}}/>
            <Button onPress={calculate} title='Calculate' style={styles.button} />
          </View>
        </ScrollView>
      </SafeAreaView>
    </>
  );
};

const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: Colors.lighter,
    padding : 12,
  },
  body: {
    backgroundColor: '#eeeeee',
  },
  title: {
    fontSize: 22,
    fontWeight: '600',
    color: Colors.black,
    marginBottom : 12,
  },
  input : {
    borderColor : '#1c1c1c',
    fontSize : 18, 
    borderWidth : 2,
    padding : 12,
    marginBottom : 12,
  },
  button : {
    height : 120,
  },  
  footer: {
    color: Colors.dark,
    fontSize: 12,
    fontWeight: '600',
    padding: 4,
    paddingRight: 12,
    textAlign: 'right',
  },
});

export default App;
