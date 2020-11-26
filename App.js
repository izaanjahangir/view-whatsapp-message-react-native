import React from 'react';
import {SafeAreaView, View, Text, StatusBar} from 'react-native';

const App = () => {
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView style={{flex: 1}}>
        <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
          <Text>Test</Text>
        </View>
      </SafeAreaView>
    </>
  );
};

export default App;
