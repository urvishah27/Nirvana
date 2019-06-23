<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>BotUI - Hello World</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/botui/build/botui.min.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/botui/build/botui-theme-default.css" />
  </head>
  <body>
    <div class="botui-app-container" id="hello-world">
      <bot-ui></bot-ui>
    </div>
    <script src="https://cdn.jsdelivr.net/vue/latest/vue.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/botui/build/botui.js"></script>
    <script>
      var botui = new BotUI('hello-world');

      botui.message.add({
        content: 'Hi! How are you?'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'May I know about your problem?'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'Elaborate please..'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'I see.. Have you tried all the solutions?'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'Do you have any helpline numbers?'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'You can contact ASARA tel:91-22-27546669'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value);

        botui.message.add({
          delay:1000,
        content: 'Hope you get the right solutions...Live life, Love Life. Goodbye.'
      }).then(function () { // wait till previous message has been shown.

        botui.action.text({
        action: {
          placeholder: 'Enter your text here'
        }
      }).then(function (res) { // will be called when it is submitted.
        console.log(res.value); // will print whatever was typed in the field.
      }); // will print whatev // will print whatever was typed in the field.
      }); // will print whatever was typed in the field.
      }); // will print whatever was typed in the field.
      });
      }); // will print whatever was typed in the field.
      });
      });
         // will print whatever was typed in the field.
      });

      });});});});});});

    </script>
  </body>
</html>
